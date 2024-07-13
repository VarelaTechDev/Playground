public class SplitPlayground {


    String extractUserToken(String authorization) {
        String[] authorizationClaims;

        String AAT = "aat=";
        String USER_AUTHORIZATION = "user_authorization=";

        if(authorization.contains(AAT)) {
            authorizationClaims = authorization.split(AAT);
        } else {
            authorizationClaims = authorization.split(USER_AUTHORIZATION);
        }

        return authorizationClaims.length == 2 ? authorizationClaims[1] : null;
    }
}
