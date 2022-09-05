# Build và install SDK

```shell
# Clone sdk
git clone https://github.com/aws/aws-sdk-cpp.git && cd aws-sdk-cpp
git submodule update --init --recursive

# Build và install
# Note: Thay thế -DBUILD_ONLY="s3" để build module khác trong SDK, trong bài ví dụ này chúng ta chỉ build module s3
mkdir sdk_build
cd sdk_build
cmake ../ -DCMAKE_BUILD_TYPE=Debug -DCMAKE_PREFIX_PATH=/usr/local/ -DCMAKE_INSTALL_PREFIX=/usr/local/ -DBUILD_ONLY="s3"
make
sudo make install
```

Ref: https://docs.aws.amazon.com/sdk-for-cpp/v1/developer-guide/setup-linux.html

# Build và chạy thử app

```shell
# Build
mkdir my_project_build
cd my_project_build
cmake ../
make

# Chạy thử
./app

# Ví dụ kết quả
Found 1 buckets
khoanda-bucket
```