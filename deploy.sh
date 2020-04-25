#!/bin/bash

set -x
set -e

aws cloudformation package --template-file template.yml --s3-bucket S3_BUCKET --output-template-file out.yml
aws cloudformation deploy --template-file out.yml --stack-name sample-java --capabilities CAPABILITY_NAMED_IAM