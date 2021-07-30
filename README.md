
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
	
Note: 
- Value of apiDemoApps_api_key and dragSortApps_api_key can be retrieved at https://katalon.atlassian.net/wiki/spaces/TEAM/pages/116555811/Tokens+to+run+mobile+sample+script+with+saucelabs+device
- To run Test Suite "Foody": Make sure your machine has installed "cMake" due to it has Image-based Testing (FYI: https://docs.katalon.com/katalon-studio/docs/mobile-image-based-testing.html#set-up)

## Companion products

### Katalon TestOps

[Katalon TestOps](https://analytics.katalon.com) is a web-based application that provides dynamic perspectives and an insightful look at your automation testing data. You can leverage your automation testing data by transforming and visualizing your data; analyzing test results; seamlessly integrating with such tools as Katalon Studio and Jira; maximizing the testing capacity with remote execution.

* Read our [documentation](https://docs.katalon.com/katalon-analytics/docs/overview.html).
* Ask a question on [Forum](https://forum.katalon.com/categories/katalon-analytics).
* Request a new feature on [GitHub](CONTRIBUTING.md).
* Vote for [Popular Feature Requests](https://github.com/katalon-analytics/katalon-analytics/issues?q=is%3Aopen+is%3Aissue+label%3Afeature-request+sort%3Areactions-%2B1-desc).
* File a bug in [GitHub Issues](https://github.com/katalon-analytics/katalon-analytics/issues).

### Katalon Studio
[Katalon Studio](https://www.katalon.com) is a free and complete automation testing solution for Web, Mobile, and API testing with modern methodologies (Data-Driven Testing, TDD/BDD, Page Object Model, etc.) as well as advanced integration (JIRA, qTest, Slack, CI, Katalon TestOps, etc.). Learn more about [Katalon Studio features](https://www.katalon.com/features/).
