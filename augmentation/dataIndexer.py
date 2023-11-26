import json
import openpyxl


file_path = 'data.jsonl'


workbook = openpyxl.Workbook()

index = 1


sheet = workbook.active


d = []


with open(file_path, 'r') as file:

    for line in file:

        data = json.loads(line)
    
        l = []


        comp = data["complexity"]

        l.append(index)
        l.append(comp)

        d.append(l)


        index+=1

for row in d:
    sheet.append(row)

workbook.save('dd.xlsx')


