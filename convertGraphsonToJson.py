# graphson 파일을 우리에게 필요한 json 형태로 바꾸기 위함 
import json

try:
    with open("\graphsonFiles\export.json","r") as file:
        data = json.load(file)
        data
except:
    print("error")