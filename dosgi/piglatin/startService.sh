#!/bin/sh
pax-run.sh --p=e --profiles=cxf.dosgi --snapshot --dir=servicerunner pigservice/target/pig-latin-service-1.0.0.jar@update piginterface/target/pig-latin-service-interface-1.0.0.jar@update
