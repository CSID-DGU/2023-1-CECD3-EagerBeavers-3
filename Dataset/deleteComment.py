# 주석을 삭제하기 위한 코드입니다

for i in range(4517):
    try :
        
        f = open("C:\school\jongsul\originalJavaFiles\originalJavaFiles\ogFile"+str(i)+".java","r",encoding="utf-8")
        fr = open(".\commentDeleted\ogFileCommentDeleted"+str(i)+".java","w")

        # 각 줄 별로 반복
        manyLineCommentStartsLine = -1

        while True :
            line = f.readline()

            if not line : break
            # 주석지우기
            if line.find("//")!=-1 : 
                line = line[0:line.find("//")]+"\n"
            if "/*" in line :
                manyLineCommentStartsLine = 1
            if "*/" in line and manyLineCommentStartsLine==1: 
                manyLineCommentStartsLine = -1
                line = ""
            if manyLineCommentStartsLine==1 : 
                line = ""
            
            fr.write(line)

        f.close()
        fr.close()

    except :
        continue



