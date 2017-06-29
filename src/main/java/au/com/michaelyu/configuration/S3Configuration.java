package au.com.michaelyu.configuration;


import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.Bucket;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class S3Configuration {

    @Bean
    public AmazonS3 configureClient() {
        AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
                            .withCredentials(new ProfileCredentialsProvider("default"))
                            .build();

        List<Bucket> buckets = s3Client.listBuckets();
        for (Bucket bucket : buckets) {
            System.out.println(bucket.getName() + ": " + bucket.getCreationDate());
        }
        return s3Client;
    }
}
