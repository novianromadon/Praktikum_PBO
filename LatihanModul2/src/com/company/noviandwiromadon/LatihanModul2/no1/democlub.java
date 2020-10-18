package com.company.noviandwiromadon.LatihanModul2.no1;

public class democlub {
    public static void main(String[] args) {
        club club0 = new club();
        club club1 = new club("Barcelona");
        club club2 = new club("Barcelona", "Tim terbaik");
        club club3 = new club("Barcelona", 1998, "Camp Nou");
        club club4 = new club("Barcelona", 1998, "Camp Nou",110, "Tim terbaik");

        System.out.println("[Club Tanpa Parameter]");
        club0.getTeam();
        System.out.println();
        System.out.println("[Club 1 Parameter]");
        club1.getTeam();
        System.out.println();
        System.out.println("[Club 2 Parameter]");
        club2.getTeam();
        System.out.println();
        System.out.println("[Club 3 Parameter]");
        club3.getTeam();
        System.out.println();
        System.out.println("[Club 5 Parameter]");
        club4.getTeam();
    }
}
