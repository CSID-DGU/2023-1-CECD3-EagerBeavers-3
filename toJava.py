import jsonlines
import json
from collections import OrderedDict


data_list = []
label_list = []


with jsonlines.open("data.jsonl") as f:
    for line in f :
        data_list.append(line["src"])
        label_list.append(line["complexity"])



i=0
for code in data_list:
    try :
        with open("originalJavaFiles/ogFile"+str(i)+".java","w") as file :
            file.write(code)
            i+=1
    except :
        continue


