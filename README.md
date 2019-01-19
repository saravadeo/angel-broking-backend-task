# angel-broking-backend-task
Simple application to get transaction history using Spring boot

# Step to run project
  - Import Project as maven project
  - Make sure you have mysql database installed
  - Create database angelbroking
  - If your database username/password different than root/root then update application properties with your database username/password
  - Run Application
  
### Database Structure
![alt text](https://drive.google.com/uc?id=1GGjPzQjjIgDLfPXXB4thsWkw77f65FFX)

Features
-------------
`GET` : <http://127.0.0.1:9091/transaction/details?username=user1> (Get method below request param `username`)

`Response`

    {
        "userDto": {
            "username": "user1",
            "cardType": "CREDIT",
            "limit": 100000
        },
        "history": [
            {
                "month": "Oct",
                "year": 2018,
                "totalSpent": 35000,
                "spentOn": {
                    "OTHER": 20000,
                    "SHOPPING": 10000,
                    "MEDICINE": 5000
                },
                "currentMonth": false
            },
            {
                "month": "Nov",
                "year": 2018,
                "totalSpent": 45000,
                "spentOn": {
                    "OTHER": 15000,
                    "SHOPPING": 20000,
                    "MEDICINE": 10000
                },
                "currentMonth": false
            },
            {
                "month": "Dec",
                "year": 2018,
                "totalSpent": 42000,
                "spentOn": {
                    "OTHER": 10000,
                    "SHOPPING": 25000,
                    "MEDICINE": 7000
                },
                "currentMonth": false
            },
            {
                "month": "Jan",
                "year": 2019,
                "totalSpent": 65000,
                "spentOn": {
                    "OTHER": 20000,
                    "SHOPPING": 30000,
                    "MEDICINE": 15000
                },
                "currentMonth": true
            }
        ]
}
