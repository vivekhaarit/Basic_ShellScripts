#!/bin/bash

message="Hello <<user>>, How are you?"
read -p 'username: ' username
echo $message | sed -e 's/<<user>>/'$username'/g'

