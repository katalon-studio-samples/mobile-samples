
1. Run with KS/KSE: 
	- Real device: select 'default' profile and run with real device (Android/iOS) option
	- Saucelabs device: select 'saucelabs' profile (remember to provide value for g_apiDemoApps_api_key and g_dragSortApps_api_key in the profile) and run with Remote option
	
2. Run with RE:
	- Real device: -executionProfile="default" -deviceId="ZX1G22GBJK" -browserType="Android" in which deviceId is changed depending on what device you use
	- Saucelabs device: -executionProfile="saucelabs" -browserType="Remote" -g_apiDemoApps_api_key=<> -g_dragSortApps_api_key=<>
	
Note: Value of g_apiDemoApps_api_key and g_dragSortApps_api_key can be retrieved at https://katalon.atlassian.net/wiki/spaces/TEAM/pages/116555811/Tokens+to+run+mobile+sample+script+with+saucelabs+device