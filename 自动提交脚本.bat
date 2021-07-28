time=$(date "+%Y-%m-%d")
echo "commit success!，your commit msg is $time , welcome to my program"

git add .

git commit -m "$time"

# 上传到 github
git push -u origin main
