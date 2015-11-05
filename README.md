OpenShift Spark Framework Lightweight Cartridge
===============================================

Runs [Spark Framework](http://sparkjava.com/) on [OpenShift](https://www.openshift.com/) using downloadable cartridge support. To install to OpenShift from the CLI, run:

	rhc app create simpleapp diy --from-code=https://github.com/gkiryaziev/spark-openshift-lightweight-cartridge.git
	
For deploy new app on server, just put new `server.jar` into root directory and push it.

Java version 1.8.0_66.
