package View.Menu;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum Commands {
    //  Login/Register Menu
    CREATE_ACCOUNT("(?i)createaccount\\s+(\\S+)\\s+(\\S+)"),
    LOGIN("(?i)login\\s+(\\S+)"),

    // UsersMenu
    VIEW_PERSONAL_INFO("(?i)view\\s+personal\\s+info"),
    EDIT_FIELD("(?i)edit\\s+(\\S+)"),

    //  UsersMenu -> Manger
    MANAGE_USERS("(?i)manage\\s+users"),
    VIEW_USER("(?i)view\\s+(\\S+)"),
    DELETE_USER("(?i)delete\\s+user\\s+(\\S+)"),
    CREATE_MANAGER_PROFILE("(?i)create\\s+manager\\s+profile"),
    MANAGE_ALL_PRODUCTS("(?i)manage\\s+all\\s+products"),
    REMOVE_PRODUCT("(?i)remove\\s+(\\S+)"),
    CREATE_DISCOUNT_CODE("(?i)create\\s+discount\\s+code"),
    VIEW_DISCOUNT_CODES("(?i)view\\s+discount\\s+codes"),
    VIEW_DISCOUNT_CODE("(?i)view\\s+discount\\s+code\\s+(\\S+)"),
    EDIT_DISCOUNT_CODE(""),
    REMOVE_DISCOUNT_CODE(""),
    MANAGE_REQUESTS(""),
    DETAILS_OF_REQUEST(""),
    ACCEPT_REQUEST(""),
    DECLINE_REQUEST(""),
    MANAGE_CATEGORIES(""),
    EDIT_CATEGORY(""),
    ADD_CATEGORY(""),
    REMOVE_CATEGORY(""),

    // UsersMenu -> Saler
    VIEW_COMPANY_INFORMATION(""),
    VIEW_SALES_HISTORY(""),
    MANAGE_PRODUCTS(""),
    VIEW_PRODUCT(""),
    VIEW_PRODUCT_BUYERS(""),
    EDIT_PRODUCT_DETAILS(""),
    ADD_PRODUCT(""),
    //REMOVE_PRODUCT(""),
    SHOW_CATEGORIES(""),
    VIEW_OFFS(""),
    VIEW_OFF(""),
    EDIT_OFF(""),
    ADD_OFF(""),
    VIEW_BALANCE(""),

    // UsersMenu -> Buyer
    VIEW_CART(""),
    SHOW_PRODUCTS(""),
    //VIEW_PRODUCT
    INCREASE_PRODUCT_COUNTS(""),
    DECREASE_PRODUCT_COUNTS(""),
    SHOW_TOTAL_PRICE(""),
    PURCHASE(""),
    VIEW_ORDERS(""),
    SHOW_ORDER(""),
    RATE_ORDER(""),
    //VIEW_BALANCE(""),
    //VIEW_DISCOUNT_CODES

    // ProductsMenu
    PRODUCTS(""),
    VIEW_CATEGORIES(""),
    FILTERING(""),
    SHOW_AVAILABLE_FILTERS(""),
    FILTER_WITH_FILTER(""),
    CURRENT_FILTERS(""),
    DISABLE_FILTER(""),
    SORTING(""),
    SHOW_AVAILABLE_SORTS(""),
    SORT_WITH_SORT(""),
    CURRENT_SORT(""),
    DISABLE_SORT(""),
    //SHOW_PRODUCTS(""),
    SHOW_PRODUCT(""),

    // ProductMenu
    DIGEST(""),
    ADD_TO_CART(""),
    SELECT_SELLER(""),
    ATTRIBUTES(""),
    COMPARE(""),
    COMMENTS(""),
    ADD_COMMENT_TITLE_CONTENT(""),

    // OffsMenu
    OFFS(""),
    //SHOW_PRODUCT
    //SEARCH & FILTERING

    HELP("(?i)help"),
    BACK(""),
    EXIT("");

    protected Pattern commandPattern;

    public Pattern getCommandPattern() {
        return commandPattern;
    }

    public Matcher getCommandMatcher(String command){
        return this.commandPattern.matcher(command);
    }

    Commands(String commandPatternRegex) {
        this.commandPattern = Pattern.compile(commandPatternRegex);
    }
}