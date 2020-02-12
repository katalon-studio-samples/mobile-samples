
1. Run with KS/KSE: 
	- Real device: 
	   + Open 'Test Suites/Regression - Real device' test suite collection
	   + Provide device name for each test suite in the collection at 'Run Configuration' column 
	   + Click Execution button in the collection
	- Saucelabs device: 
	   + Open 'saucelab' profile then provide value for two properties 'apiDemoApps_api_key' and 'dragSortApps_api_key'
	   + Open Test Suites/Regression - Real device' test suite collection
	   + Click Execution button in the collection
	
2. Run with RE:
	- Real device: 
	   + Open 'Test Suites/Regression - Real device' test suite collection then provide device name for each test suite in the collection at 'Run Configuration' column 
	   + In command line: -testSuiteCollectionPath="Test Suites/Regression - Saucelabs device"
	- Saucelabs device: -testSuiteCollectionPath="Test Suites/Regression - Saucelabs device" -g_apiDemoApps_api_key=<> -g_dragSortApps_api_key=<>
	
Note: Value of apiDemoApps_api_key and dragSortApps_api_key can be retrieved at https://katalon.atlassian.net/wiki/spaces/TEAM/pages/116555811/Tokens+to+run+mobile+sample+script+with+saucelabs+device