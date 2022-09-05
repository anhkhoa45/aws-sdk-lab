## Setup môi trường

B1: Sau khi clone project, chạy code terraform ở folder `ec2-terraform` để tạo môi trường

B2: SSH vào EC2 instance vừa mới tạo

B3: Clone repo aws-sdk-lab

B4: Chạy setup.sh để cài đặt môi trường

```shell
bash aws-sdk-lab/credentials-demo/setup.sh
```

## Instance profile

Sau khi đã cài đặt xong. EC2 instance vừa tạo sẽ sử dụng instance profile với role là `HelloSDKRole`

Chạy lệnh sau để xem credentials hiện tại đang sử dụng là gì

```shell
python3 get-caller-identity.py
```

## File ~/.aws/credentials

Tạo 1 IAM user mới, copy key và secret, sửa file `~/.aws/credentials`, `~/.aws/config`

```shell
vi ~/.aws/credentials
```

Nội dung file:

```
[default]
aws_access_key_id = ...
aws_secret_access_key = ...
```

```
vi ~/.aws/config
```

Nội dung file:

```
[default]
region = ap-southeast-1
output = json
```

Chạy lại code get-caller-identity để xem user hiện tại là gì

```
python3 get-caller-identity.py
```

## Environment variables

Set environment variables bằng những command sau

```shell
export AWS_ACCESS_KEY_ID=...
export AWS_SECRET_ACCESS_KEY=...
export AWS_REGION=ap-southeast-1
```

Thử chạy lại get-caller-identity và xem kết quả

```shell
python3 get-caller-identity.py
```

## Application config

```shell
cd app_config
```

Tạo 1 IAM user mới. Sửa key/secret trong file `gradle.properties` và chạy lệnh sau để xem user hiện tại là gì

```shell
./gradlew run
```
