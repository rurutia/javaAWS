package au.com.michaelyu.configuration;


import com.amazonaws.services.s3.AmazonS3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class S3Configuration {

    @Bean
    public AmazonS3 configureClient() {
//        AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
//                            .withCredentials(new ProfileCredentialsProvider("default"))
//                            .build();
//
//        List<Bucket> buckets = s3Client.listBuckets();
//        for (Bucket bucket : buckets) {
//            System.out.println(bucket.getName() + ": " + bucket.getCreationDate());
//        }
//        return s3Client;
        return null;
    }
}
