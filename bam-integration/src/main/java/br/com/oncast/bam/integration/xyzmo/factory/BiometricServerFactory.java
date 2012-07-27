package br.com.oncast.bam.integration.xyzmo.factory;

import java.util.ArrayList;
import java.util.List;

import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.axis2.transport.http.HttpTransportProperties;
import org.apache.commons.httpclient.Credentials;
import org.apache.commons.httpclient.NTCredentials;
import org.apache.commons.httpclient.auth.AuthScheme;
import org.apache.commons.httpclient.auth.CredentialsNotAvailableException;
import org.apache.commons.httpclient.auth.CredentialsProvider;
import org.apache.commons.httpclient.params.DefaultHttpParams;

import com.xyzmo.wwww.biometricserver.WebServiceUserAndProfileStub;

public class BiometricServerFactory {

	private WebServiceUserAndProfileStub webServiceUserAndProfile = null;
	
	private String serverAddress = "testserver";
	private String domain = "testserver";
	private String username = "usermanager";
	private String password = "%User%01";
	private int portNumber = 50200;
	
	public WebServiceUserAndProfileStub getWebServiceProxyUserAndProfile() {
		try {
			webServiceUserAndProfile = new WebServiceUserAndProfileStub("http://" + this.serverAddress + ":50200/WebServices/WebServiceUserAndProfile.asmx");

			HttpTransportProperties.Authenticator auth = createAuthenticator();
			
	        DefaultHttpParams.getDefaultParams().setParameter("http.authentication.credential-provider", createCredentialsProvider());
	        
			webServiceUserAndProfile._getServiceClient().getOptions().setProperty(HTTPConstants.AUTHENTICATE, auth);
			return webServiceUserAndProfile;
		}
		catch (Exception e) {
			return null;
		}
	}
	
	private CredentialsProvider createCredentialsProvider() {
        final NTCredentials nt = new NTCredentials(username, password, domain, domain);
        final CredentialsProvider credentialsProvider = new CredentialsProvider() {
            public Credentials getCredentials(final AuthScheme scheme, final String host, int port, boolean proxy) throws CredentialsNotAvailableException {
                return nt; 
            }
        };
        return credentialsProvider;
	}
	
	private HttpTransportProperties.Authenticator createAuthenticator() {
		HttpTransportProperties.Authenticator auth = new HttpTransportProperties.Authenticator();
		auth.setHost(this.serverAddress);
		auth.setPort(portNumber);

		auth.setDomain(domain);
		auth.setUsername(username);
		auth.setPassword(password);
		
		List<String> authScheme = new ArrayList<String>();
		authScheme.add(HttpTransportProperties.Authenticator.BASIC);
		auth.setAuthSchemes(authScheme);
		return auth;
	}
}
