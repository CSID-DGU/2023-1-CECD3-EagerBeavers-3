#!/bin/zsh

# joern 설치 경로
cd joern/joern-cli 

# 반복 횟수 설정 (0에서 3916까지)
for n in {0..3916}; do
    input_file="./originalJavaFiles/ogFile$n.java"
    output_file="./output/output$n"

    # joern-parse 실행
    ./joern-parse "$input_file"

    # joern-export 실행
    ./joern-export --out "$output_file"

    echo "Processed file $n"
done

echo "Processing completed."0