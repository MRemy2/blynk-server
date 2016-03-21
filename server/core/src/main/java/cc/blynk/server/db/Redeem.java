package cc.blynk.server.db;

import cc.blynk.utils.StringUtils;

import java.util.StringJoiner;

/**
 * The Blynk Project.
 * Created by Dmitriy Dumanskiy.
 * Created on 03.03.16.
 */
public class Redeem {

    public String token;

    public String company;

    public boolean isRedeemed;

    public String username;

    public int reward;

    public int version;

    public String formatToken() {
        return new StringJoiner(StringUtils.BODY_SEPARATOR_STRING)
                .add(company)
                .add(String.valueOf(reward))
                .add(token).toString();
    }

    public Redeem() {
        this.isRedeemed = false;
        this.version = 1;
    }

    public Redeem(String token, String company, int reward) {
        this();
        this.token = token;
        this.company = company;
        this.reward = reward;
    }

    public Redeem(String token, String company, boolean isRedeemed, String username, int reward, int version) {
        this.token = token;
        this.company = company;
        this.isRedeemed = isRedeemed;
        this.username = username;
        this.reward = reward;
        this.version = version;
    }
}
