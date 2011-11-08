When up & running you should be able to invoke either http://localhost:9090/greeter/greeter/greeting/fred or http://localhost:9091/greeter2/greeter/greeting/fred

To see the response as JSON :

curl  -H 'Accept: application/json'  http://localhost:8282/greeter/greeter/greeting/fred

To see the response as XML :

curl  -H 'Accept: text/xml'  http://localhost:8282/greeter/greeter/greeting/fred