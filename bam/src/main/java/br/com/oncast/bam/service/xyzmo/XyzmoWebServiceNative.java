package br.com.oncast.bam.service.xyzmo;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import sign.webservicenativeprototype.inputinterface.server.xyzmo.com.SignServiceNativeStub;
import management.webservicenative.inputinterface.server.xyzmo.com.ManagementServiceNativeStub;
import management.webservicenative.inputinterface.server.xyzmo.com.ManagementServiceNativeStub.GetActivities;
import management.webservicenative.inputinterface.server.xyzmo.com.ManagementServiceNativeStub.GetActivitiesResponse;
import management.webservicenative.inputinterface.server.xyzmo.com.ManagementServiceNativeStub.GetActivityConfigurationTemplate;
import management.webservicenative.inputinterface.server.xyzmo.com.ManagementServiceNativeStub.GetActivityConfigurationTemplateResponse;

public class XyzmoWebServiceNative {

	ManagementServiceNativeStub managementStub;
	SignServiceNativeStub signStub;

	public XyzmoWebServiceNative() {
		try {
			managementStub = new ManagementServiceNativeStub();
			signStub = new SignServiceNativeStub();
		} catch (AxisFault e) {
			e.printStackTrace();
		}
	}

	public String[] getAvailableActivities() throws RemoteException {
		GetActivities gA = new GetActivities();
		GetActivitiesResponse resGetAct = managementStub.getActivities(gA);
		ManagementServiceNativeStub.ArrayOfString activities = resGetAct.getGetActivitiesResult();
		return activities.getString();
	}

	public String getActivityConfigurationTemplate(String activityOfInterest) throws RemoteException {
		GetActivityConfigurationTemplate template = new GetActivityConfigurationTemplate();
		template.setActivity(activityOfInterest);
		GetActivityConfigurationTemplateResponse resGetConfig =	managementStub.getActivityConfigurationTemplate(template);
		return resGetConfig.getGetActivityConfigurationTemplateResult();
	}

}
