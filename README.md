
1. Run with KS/KSE: 
	- Real device: select 'default' profile and run with real device (Android/iOS) option
	- Saucelabs device: select 'saucelabs' profile and run with Remote option
	
2. Run with RE:
	- Real device: -executionProfile="default" -deviceId="ZX1G22GBJK" -browserType="Android" in which deviceId is changed depending on what device you use
	- Saucelabs device: -executionProfile="saucelabs" -browserType="Remote" -g_apiDemoApps_api_key=<> -g_dragSortApps_api_key=<>

