import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import java.security.KeyStore;
import java.security.cert.X509Certificate;


/*
java -Djavax.net.ssl.trustStoreType=WINDOWS-ROOT CheckRootCA
java -Djavax.net.ssl.trustStoreType=WINDOWS-MY CheckRootCA
 */
public class CheckRootCA {

    public static void main(String[] args) {

        try {
            TrustManagerFactory trustManagerFactory =
                    TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            for (TrustManager manager: trustManagerFactory.getTrustManagers())
            {
                for(X509Certificate cert: ((X509TrustManager)manager).getAcceptedIssuers())
                {
                    System.out.println(cert.getSubjectDN().getName());
                }
                System.out.println("----------------------");
                System.out.println("# of Accepted Issuers: " + ((X509TrustManager)manager).getAcceptedIssuers().length);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
