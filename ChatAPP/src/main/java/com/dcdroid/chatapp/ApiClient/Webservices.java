package com.dcdroid.chatapp.ApiClient;

/**
 * Created by admin on 07-Mar-17.
 */

public interface Webservices {
    /*DOCUMENT : System API v1.2*/



/*
    //1.Login
    @GET("/Login.aspx")
    void LogintoServer(@QueryMap(encodeValues = false) Map<String, String> map, Callback<LoginAPI> callback);
    *//*    http://atoms.zmallplanet.com/API/Common/UserProfile.aspx?AppsName=IM&UserName=app.programming&UserType=Consultant*//*



    //1.Login
    @GET("/getSponsoringClients")
    void getClients(@QueryMap Map<String, String> map, Callback<LoginAPI> callback);





    //2. UserProfile
    @GET("/UserProfile.aspx")
    void UserProfile(@QueryMap Map<String, String> map, Callback<UserProfile> callback);


    //3. Group List
    @GET("/Group.aspx")
    void getGroupList(@QueryMap Map<String, String> map, Callback<GroupList> callback);


    //4. Group User Map List
    @GET("/GroupUserMap.aspx")
    void getGroupUsers(@QueryMap Map<String, String> map, Callback<GroupUser> callback);


    //5. Group User List
    @GET("/User.aspx")
    void getGroupUsersList(@QueryMap Map<String, String> map, Callback<GroupUsersList> callback);


    //API - 1 ,openfire API for Creating rooms

    @POST("/chatrooms")
    void createGroupOnOpenfire(@Header("Content-Type") String content_type, @Header("Authorization") String auth, @Body JsonObject jsonBody, Callback<String> callback);

    //API - 2 , openfire API for Creating users

    @POST("/users")
    void createUserOnOpenfire(@Header("Content-Type") String content_type, @Header("Authorization") String auth, @Body JsonObject jsonBody, Callback<String> callback);
    //API - 3 , openfire API for Checking users

    @GET("/users/{id}")
    void checkUserOnOpenfire(@Header("Accept") String accept, @Header("Authorization") String auth, @Path("id") String Username, Callback<JsonObject> callback);

    //API - 4 , openfire API for adding users into Openfire Group

    @POST("/chatrooms/{roomname}/members/{username}")
    void addUserToOpenFireRoom(@Header("Content-Type") String content_type, @Header("Authorization") String auth, @Path("roomname") String room_name, @Path("username") String user_name, Callback<String> callback);

    @GET("/BadFilter.aspx")
    void checkBadKeyWords(@QueryMap Map<String, String> map, Callback<BadKeyWord> callback);


    @GET("/SaveMessage.aspx")
    void saveMessageonServer(@QueryMap Map<String, String> map, Callback<SaveMessage> callback);

    @Multipart
    @POST("/SaveMessage.aspx")
    void saveMessageonServerWithData(@QueryMap Map<String, String> map, @Part("file") TypedFile file, Callback<SaveMessage> callback);


    @GET("/userservice")
    void updateUseronOpenfireServer(@QueryMap Map<String, String> map, Callback<String> callback);*/
    /*6. Save Message*/
/*
    @GET("/User.aspx")
    public void getSaveMessages(@QueryMap Map<String, String> map, Callback<Message> callback);*/
    /*7. Show Message*/
    /*8. Bad Filter*/


}
