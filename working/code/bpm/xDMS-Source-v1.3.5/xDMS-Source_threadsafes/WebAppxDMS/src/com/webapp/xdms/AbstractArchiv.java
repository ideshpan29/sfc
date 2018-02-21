package com.webapp.xdms;

import javax.servlet.http.HttpServlet;
import org.osoa.sca.annotations.Property;

/**
 * Abstract interface generated for component "Archiv".
 *
 * This class will be completely generated, add custom code to the subclass: 
 * {@link com.webapp.xdms.AbstractArchiv AbstractArchiv}
 *
 * @Generated TEMPL003
 */
public abstract class AbstractArchiv extends HttpServlet {

	private java.lang.String rootFilePath;

	@Property(name = "rootFilePath")
	public void setRootFilePath(java.lang.String rootFilePath) {
		this.rootFilePath = rootFilePath;
	}

	public java.lang.String getRootFilePath() {
		return rootFilePath;
	}
	private java.lang.String rootFilePathTemp;

	@Property(name = "rootFilePathTemp")
	public void setRootFilePathTemp(java.lang.String rootFilePathTemp) {
		this.rootFilePathTemp = rootFilePathTemp;
	}

	public java.lang.String getRootFilePathTemp() {
		return rootFilePathTemp;
	}

}
