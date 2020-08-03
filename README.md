# demo Note
- JDK 1.8
- MAVEN VERSION 3.6.1
- Default port 8081

#To Deploy Project
- 1.) mvn clean install
- 2.) mvn spring-boot:run

#PostMan Collection import
https://www.getpostman.com/collections/bab0e8c19262b281779d

#Sample run (Same as the postman collection)
- 1.) GetAllUsers
```http://localhost:8081/users```
```
{
       "user": [
           {
               "id": "user0@gmail.com",
               "name": "User0",
               "phoneNumber": "0000000000",
               "transactionList": [
                   {
                       "id": "user0",
                       "transactionId": "0001",
                       "type": "type0",
                       "billing": "user0_Billing",
                       "subscriptions": "user0_Sub",
                       "date": "2020-01-02T05:01:00.000+00:00"
                   }
               ]
           },
           {
               "id": "user1@gmail.com",
               "name": "User1",
               "phoneNumber": "1111111111",
               "transactionList": [
                   {
                       "id": "user1",
                       "transactionId": "0101",
                       "type": "type0",
                       "billing": "user1_Billing",
                       "subscriptions": "user1_Sub",
                       "date": "2020-01-02T07:01:00.000+00:00"
                   },
                   {
                       "id": "user1",
                       "transactionId": "0102",
                       "type": "type1",
                       "billing": "user1_Billing",
                       "subscriptions": "user1_Sub",
                       "date": "2020-01-03T05:01:00.000+00:00"
                   }
               ]
           },
           {
               "id": "user2@gmail.com",
               "name": "User2",
               "phoneNumber": "2222222222",
               "transactionList": [
                   {
                       "id": "user2",
                       "transactionId": "0201",
                       "type": "type1",
                       "billing": "user2_Billing",
                       "subscriptions": "user2_Sub",
                       "date": "2020-01-01T05:01:00.000+00:00"
                   },
                   {
                       "id": "user2",
                       "transactionId": "0202",
                       "type": "type2",
                       "billing": "user2_Billing",
                       "subscriptions": "user2_Sub",
                       "date": "2020-01-03T06:01:00.000+00:00"
                   },
                   {
                       "id": "user2",
                       "transactionId": "0203",
                       "type": "type1",
                       "billing": "user2_Billing",
                       "subscriptions": "user2_Sub",
                       "date": "2020-01-03T06:01:00.000+00:00"
                   }
               ]
           },
           {
               "id": "user3@gmail.com",
               "name": "User3",
               "phoneNumber": "3333333333",
               "transactionList": [
                   {
                       "id": "user3",
                       "transactionId": "0301",
                       "type": "type0",
                       "billing": "user3_Billing",
                       "subscriptions": "user3_Sub",
                       "date": "2020-01-02T07:01:00.000+00:00"
                   },
                   {
                       "id": "user3",
                       "transactionId": "0302",
                       "type": "type1",
                       "billing": "user3_Billing",
                       "subscriptions": "user3_Sub",
                       "date": "2020-01-03T06:01:00.000+00:00"
                   }
               ]
           }
       ]
   }
```   
- 2.) GetUserById ```http://localhost:8081/user/user2@gmail.com```
```
{
    "user": [
        {
            "id": "user2@gmail.com",
            "name": "User2",
            "phoneNumber": "2222222222",
            "transactionList": [
                {
                    "id": "user2",
                    "transactionId": "0201",
                    "type": "type1",
                    "billing": "user2_Billing",
                    "subscriptions": "user2_Sub",
                    "date": "2020-01-01T05:01:00.000+00:00"
                },
                {
                    "id": "user2",
                    "transactionId": "0202",
                    "type": "type2",
                    "billing": "user2_Billing",
                    "subscriptions": "user2_Sub",
                    "date": "2020-01-03T06:01:00.000+00:00"
                },
                {
                    "id": "user2",
                    "transactionId": "0203",
                    "type": "type1",
                    "billing": "user2_Billing",
                    "subscriptions": "user2_Sub",
                    "date": "2020-01-03T06:01:00.000+00:00"
                }
            ]
        }
    ]
}
```
- 3.) GetAllTransactions ```http://localhost:8081/transactions```

```
{
    "transaction": [
        {
            "id": "user0",
            "transactionId": "0001",
            "type": "type0",
            "billing": "user0_Billing",
            "subscriptions": "user0_Sub",
            "date": "2020-01-02T05:01:00.000+00:00"
        },
        {
            "id": "user1",
            "transactionId": "0101",
            "type": "type0",
            "billing": "user1_Billing",
            "subscriptions": "user1_Sub",
            "date": "2020-01-02T07:01:00.000+00:00"
        },
        {
            "id": "user1",
            "transactionId": "0102",
            "type": "type1",
            "billing": "user1_Billing",
            "subscriptions": "user1_Sub",
            "date": "2020-01-03T05:01:00.000+00:00"
        },
        {
            "id": "user2",
            "transactionId": "0201",
            "type": "type1",
            "billing": "user2_Billing",
            "subscriptions": "user2_Sub",
            "date": "2020-01-01T05:01:00.000+00:00"
        },
        {
            "id": "user2",
            "transactionId": "0202",
            "type": "type2",
            "billing": "user2_Billing",
            "subscriptions": "user2_Sub",
            "date": "2020-01-03T06:01:00.000+00:00"
        },
        {
            "id": "user2",
            "transactionId": "0203",
            "type": "type1",
            "billing": "user2_Billing",
            "subscriptions": "user2_Sub",
            "date": "2020-01-03T06:01:00.000+00:00"
        },
        {
            "id": "user3",
            "transactionId": "0301",
            "type": "type0",
            "billing": "user3_Billing",
            "subscriptions": "user3_Sub",
            "date": "2020-01-02T07:01:00.000+00:00"
        },
        {
            "id": "user3",
            "transactionId": "0302",
            "type": "type1",
            "billing": "user3_Billing",
            "subscriptions": "user3_Sub",
            "date": "2020-01-03T06:01:00.000+00:00"
        }
    ]
}
```
- 4.) GetAllTransactionByDate ```http://localhost:8081/transaction/2020-01-02-02```
```
{
    "transaction": [
        {
            "id": "user1",
            "transactionId": "0101",
            "type": "type0",
            "billing": "user1_Billing",
            "subscriptions": "user1_Sub",
            "date": "2020-01-02T07:01:00.000+00:00"
        },
        {
            "id": "user3",
            "transactionId": "0301",
            "type": "type0",
            "billing": "user3_Billing",
            "subscriptions": "user3_Sub",
            "date": "2020-01-02T07:01:00.000+00:00"
        }
    ]
}
```
- 5.) GetAllTransactionByIdAndDate ```http://localhost:8081/transactionsIdDate/user2/2020-01-03-01```
```
{
    "transaction": [
        {
            "id": "user2",
            "transactionId": "0202",
            "type": "type2",
            "billing": "user2_Billing",
            "subscriptions": "user2_Sub",
            "date": "2020-01-03T06:01:00.000+00:00"
        },
        {
            "id": "user2",
            "transactionId": "0203",
            "type": "type1",
            "billing": "user2_Billing",
            "subscriptions": "user2_Sub",
            "date": "2020-01-03T06:01:00.000+00:00"
        }
    ]
}
```
- 6.) GetAllTransactionByIdAndType ```http://localhost:8081/transactionsIdType/user2/type1```
```
{
    "transaction": [
        {
            "id": "user2",
            "transactionId": "0201",
            "type": "type1",
            "billing": "user2_Billing",
            "subscriptions": "user2_Sub",
            "date": "2020-01-01T05:01:00.000+00:00"
        },
        {
            "id": "user2",
            "transactionId": "0203",
            "type": "type1",
            "billing": "user2_Billing",
            "subscriptions": "user2_Sub",
            "date": "2020-01-03T06:01:00.000+00:00"
        }
    ]
}
```
