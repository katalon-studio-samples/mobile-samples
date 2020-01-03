package katalon.common

import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.driver.DriverFactory
import internal.GlobalVariable

class BaseKeyword {
	protected static info(String message){
		KeywordUtil.logInfo(message)
	}
	protected static handleError(String message, FailureHandling flowControl){
		ErrorHandler.handleError(message, flowControl)
	}

	protected static handleError(Exception ex, FailureHandling flowControl){
		ErrorHandler.handleError(ex, flowControl)
	}
}
