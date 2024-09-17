package pro.chef.dao.configurators;

import lombok.Getter;

@Getter
public enum SqlQueries {

    SELECT_ORDER_BY_NUMBER("SELECT * FROM public.orders where orders.chef_id = '2661668';");

    private final String query;

    SqlQueries(String query) {
        this.query = query;
    }

}
