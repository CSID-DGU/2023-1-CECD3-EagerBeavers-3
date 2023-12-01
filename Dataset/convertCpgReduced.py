import os

# 작업을 수행할 상위 폴더 경로 설정
top_folder = "/Users/jiminhwang/IdeaProjects/2023-1-CECD3-EagerBeavers-3/Dataset/output"  # 원하는 상위 폴더 경로로 바꾸세요
new_folder_path = "/Users/jiminhwang/IdeaProjects/2023-1-CECD3-EagerBeavers-3/Dataset/convertedCpgReduced"
# 상위 폴더 내의 모든 폴더 탐색 및 작업 수행
for root, dirs, files in os.walk(top_folder):
    for folder_name in dirs:
        folder_path = os.path.join(root, folder_name)

        # 폴더 내의 파일 목록 가져오기
        file_list = os.listdir(folder_path)
        for file in file_list:
            if file == '0-cpg.dot':
                new_file_name = folder_name + os.path.splitext(file)[-1]
                new_file_path = os.path.join(new_folder_path, new_file_name)
                old_file_path = os.path.join(folder_path, file)
                os.rename(old_file_path, new_file_path)

