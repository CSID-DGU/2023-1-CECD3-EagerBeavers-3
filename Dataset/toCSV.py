# This is a sample Python script.

# Press ⌃R to execute it or replace it with your code.
# Press Double ⇧ to search everywhere for classes, files, tool windows, actions, and settings.


import os
import re
def main():
    folder_path = "/Users/yunjiseong/Desktop/2023_2학기/컴퓨터종합설계2/augmentedCPG"
    output_csv_path = "/Users/yunjiseong/Desktop/2023_2학기/컴퓨터종합설계2/output_info.csv"

    # Create or clear the existing CSV file and write the header
    write_to_csv_header(output_csv_path)

    process_all_dot_files(folder_path, output_csv_path)

def process_all_dot_files(folder_path, output_csv_path):
    for file_name in os.listdir(folder_path):
        if file_name.endswith(".dot"):
            file_path = os.path.join(folder_path, file_name)
            print(f"Processing file: {file_name}")
            try:
                nodes_and_edges = extract_node_and_edge_info(file_path)
                write_to_csv(file_name, nodes_and_edges, output_csv_path)
            except IOError as e:
                print(f"Error processing file {file_name}: {e}")

def extract_node_and_edge_info(file_path):
    nodes = []
    edges = []

    with open(file_path, 'r') as file:
        dot_content = file.read()

        # Extract and print labels
        node_pattern = re.compile(r'"(\d+)"\s*\[label\s*=\s*<\s*\(([^,]+)')
        node_matches = node_pattern.findall(dot_content)

        for node_match in node_matches:
            node_number, literal_value = node_match
            node = f"{node_number}:{literal_value}"
            nodes.append(node)

        # Extract and print edge information
        edge_pattern = re.compile(r'"(\S+)"\s*->\s*"(\S+)"\s*\[\s*label\s*=\s*"([^:]+):\s*([^\\]]+)"\s*\]')
        edge_matches = edge_pattern.findall(dot_content)

        for edge_match in edge_matches:
            source_node, target_node, label = edge_match
            edge = f"{source_node}->{target_node}:{label}"
            edges.append(edge)

    return '|'.join(nodes) + "$" + '|'.join(edges)

def write_to_csv_header(output_csv_path):
    with open(output_csv_path, 'w') as csv_file:
        # Write CSV header
        csv_file.write("index,nodes,edges\n")

def write_to_csv(file_name, nodes_and_edges, output_csv_path):
    cleaned_file_name = extract_numeric_part(file_name)

    # Split nodes and edges using "|"
    parts = nodes_and_edges.split("$")

    if len(parts) == 2:
        # Write file name, nodes, and edges to CSV
        with open(output_csv_path, 'a') as csv_file:
            csv_file.write(f"{cleaned_file_name},\"{parts[0]}\",\"{parts[1]}\"\n")
    else:
        # Handle the case when the format is unexpected
        with open(output_csv_path, 'a') as csv_file:
            csv_file.write("\"\",\"\",{nodes_and_edges}\n")

def extract_numeric_part(file_name):
    pattern = re.compile(r'\d+')
    match = pattern.search(file_name)

    if match:
        return match.group()

    return ""

if __name__ == "__main__":
    main()
