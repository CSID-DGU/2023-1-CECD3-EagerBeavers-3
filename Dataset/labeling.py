import jsonlines
import json
from collections import OrderedDict

# 라벨 데이터 저장할 리스트
label_list = []

# jsonl 파일 가져와서 data_list에 code value만 저장
with jsonlines.open("data.jsonl") as f:
    for line in f :
        complexity = line["complexity"]
        if complexity=="constant" :
            label = 0
        elif complexity=="logn" :
            label = 1
        elif complexity=="linear" :
            label = 2
        elif complexity=="nlogn" :
            label = 3
        elif complexity=="quadratic":
            label = 4
        else :
            label = -1
        # 큐빅 
        # np 사용 안함 
        label_list.append(label)
        

print(label_list)






