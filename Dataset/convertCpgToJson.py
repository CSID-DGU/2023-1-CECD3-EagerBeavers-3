# cpg로 변환한 파일들을 json 형태로 변경하기 위한 python 파일입니다 
import json


for i in range(4516) :
    # 결과 json data
    data = {"edges":[],"features":{}}
    try :
        with open("./Dataset/ConvertedCPG/output_"+str(i)+"/0-cpg.dot","r") as file :
            print(str(i)+"번째 파일 분석")
            count = 0
            while True : 
                line = file.readline()
                count +=1
                if count==1 : continue # 첫째줄 스킵 
            
                if not line : break


                line = line.strip()
                # 마지막줄 스킵 
                if len(line)<=1 : continue
            
                if "->" in line : # 간선을 나타냄 
                    # 간선 처리
                    # print("edge")
                    # print(line)

                    info = line.split()
                    
                    data["edges"].append([info[0][1:len(info[0])-1],info[2][1:len(info[2])-1]])




                else : # 노드를 나타냄 
                    # 노드 처리
                    info = line.split()
                    # print("node")
                    node = info[0]
                    node = node[1:len(info[0])-1]

                    startIdx = 0
                    endIdx = 0
                    start = False
                    count = 0
                    for j in range(len(line)):
                        if line[j]=='<' and start==False : 
                            startIdx = j
                            start = True
                            count +=1
                            continue
                        if start == True :
                            if line[j] == '<':
                                count +=1
                            elif line[j] == '>' :
                                count -=1
                            if count == 0 :
                                endIdx = j
                                break

                    # print("sidx : "+str(startIdx)+", eidx : "+str(endIdx))
                    label = line[startIdx:endIdx+1]
                    # print(label)

                    data["features"][node] = label
                    

    except Exception as e :
        print("file read Exception : "+str(e))
        continue

    try :
    # json 파일로 저장
        print(str(i)+"번째  파일 저장") 
        with open("./cpgToJson/"+str(i)+"-cpgToJson.json",'w',encoding='utf-8') as make_file :
            json.dump(data,make_file)
    except Exception as e:
        print("file write Exception" + str(e))



    


