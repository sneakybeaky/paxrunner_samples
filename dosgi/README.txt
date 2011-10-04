This setup runs the pig latin demo from the excellent article at http://www.jroller.com/habuma/date/20090504.

1. Install pax runner - see README in the parent dir
2. Build the piglatin code using maven
3. Start the server - runServer.bat. Check that you can see http://localhost:9000/piglatin?wsdl
4. Start the client - runClient.bat. You should see the output from the test in the console.

The server has the felix webconsole installed - you should be able to connect to http://localhost:8080/system/console