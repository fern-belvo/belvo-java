package sample;

import com.belvo.api.resources.links.requests.LinksRequest;
import com.belvo.api.types.EnumLinkAccessModeRequest;
import com.belvo.api.types.Link;
import java.lang.String;
import com.belvo.api.BelvoApiClient;

public final class App {
    public static void main(String[] args) {
        BelvoApiClient belvo = BelvoApiClient.builder()
                .credentials("YOUR_SECRET_ID", "YOUR_SECRET_PASSWORD")
                .build();

        Link link = belvo.links().registerLink(LinksRequest.builder()
                .institution("banamex_mx_retail")
                .username("username")
                .password("password")
                .accessMode(EnumLinkAccessModeRequest.RECURRENT)
                .credentialsStorage("30d")
                .build());

        System.out.println(link);
    }
}
