package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies(){

        //given
        User adam = new Millenials("Adam Phinix");
        User miia = new YGeneration("Mia Bendix");
        User roy = new ZGeneration("Roy Bilgson");

        //when
        String adamSocialNet =  adam.sharePost();
        System.out.println("Adam use: " + adamSocialNet);
        String miiaSocialNetwork = miia.sharePost();
        System.out.println("Miia use: " + miiaSocialNetwork);
        String roySocialNetwork = roy.sharePost();
        System.out.println("Roy use: " + roySocialNetwork);

        assertEquals("Facebook",adamSocialNet);
        assertEquals("Twitter",miiaSocialNetwork);
        assertEquals("Snapchat",roySocialNetwork);
    }

    @Test
    void  testIndividualSharingStrategy(){
        // given
        User roy = new ZGeneration("Roy Bilgson");

        //when
        String royDefaultSocialNet = roy.sharePost();
        System.out.println("Roy default social network: " + royDefaultSocialNet);

        //when
        roy.setSocialPublisher(new FacebookPublisher());
        String royNewSocialNet = roy.sharePost();
        System.out.println("Roy new social .net: " + royNewSocialNet);

        //then
        assertEquals("Facebook", royNewSocialNet);
    }
}
