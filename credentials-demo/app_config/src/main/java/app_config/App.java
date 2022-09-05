package app_config;

import software.amazon.awssdk.auth.credentials.SystemPropertyCredentialsProvider;
import software.amazon.awssdk.services.sts.StsClient;
import software.amazon.awssdk.services.sts.model.GetCallerIdentityResponse;
import software.amazon.awssdk.services.sts.model.StsException;

public class App {

    public static void main(String[] args) {
        StsClient stsClient = StsClient.builder()
            .credentialsProvider(SystemPropertyCredentialsProvider.create())
            .build();

        getCallerId(stsClient);
        stsClient.close();
    }

    public static void getCallerId(StsClient stsClient) {
        try {
            GetCallerIdentityResponse response = stsClient.getCallerIdentity();
            System.out.println("The user id is" + response.userId());
            System.out.println("The ARN value is" + response.arn());

        } catch (StsException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
    }
}