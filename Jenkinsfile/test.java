{
  "Resources" : {
    "DB" : {
      "Type" : "AWS::RDS::DBInstance",
      "Properties" : {
        "AllocatedStorage" : "5",
        "StorageType" : "gp2",
        "DBInstanceClass" : "db.t2.micro",
        "DBName" : "wordpress",
        "Engine" : "MySQL",
        "MasterUsername" : "wordpress",
        "MasterUserPassword" : "w0rdpr355"
      }
    },
    "EC2" : {
      "Type" : "AWS::EC2::Instance",
      "Properties" : {
        "ImageId" : "ami-c481fad3",
        "InstanceType" : "t2.micro"
      }
    },
    "S3" : {
      "Type" : "AWS::S3::Bucket",
      "Properties" : {
        "BucketName" : "wp-xxxxxx"
      }
    }
  }
}

