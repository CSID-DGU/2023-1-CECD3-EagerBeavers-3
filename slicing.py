import jsonlines
import json
from collections import OrderedDict

data_list = []
# 라벨 데이터 저장할 리스트
label_list = []

nn_list = []

# jsonl 파일 가져와서 data_list에 code value만 저장
i = 1
with jsonlines.open("data.jsonl") as f:
    for line in f :
        # data_list.append(line["src"])
        # label_list.append(line["complexity"])
        print(line["complexity"]+str(i))
        i+=1



# 코드 슬라이싱 하기 위한 함수 
def sliceCode(code):
    sliced = ""
    lines = code.split("\n")
    start = 0
    count = 0
    braket = 0
    for line in lines:
        if "public static void main" in line :
            start = 1
        if start ==1 :
            sliced+=(line+"\n") 
            if "{" in line :
                braket = 1
                count+=1
            if "}" in line :
                count -=1
            if count==0 and braket==1 :
                break
    return sliced

# main
sliced_list = []
for data in data_list :
    sliced_list.append(sliceCode(data))

# result.jsonl파일에 쓰기 
with open("result.jsonl","w",encoding="utf-8") as wf:
    for i in range(len(sliced_list)):
        data = OrderedDict()
        data["code"] = sliced_list[i]
        data["complexity"] = label_list[i]
        json.dump(data, wf, ensure_ascii=False)
        wf.write("\n")


for i in range(len(sliced_list)) : 
    try :
        with open("datas/data"+str(i)+".java","w") as file : 
            file.write("public class Main{") 
            file.write(sliced_list[i])
            print(str(i)+"번째 java 파일 생성")
            file.write("}")
    except :
        continue

