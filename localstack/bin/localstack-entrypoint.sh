#!/bin/bash

printf "Configuring localstack components"

printf "Creating Animal..."

awslocal dynamodb create-table \
    --table-name Animal \
    --attribute-definitions \
      "AttributeName=id, AttributeType=S" \
    --key-schema \
      "AttributeName=id,KeyType=HASH" \
    --provisioned-throughput \
      "ReadCapacityUnits=10,WriteCapacityUnits=10"

printf "Done create components"