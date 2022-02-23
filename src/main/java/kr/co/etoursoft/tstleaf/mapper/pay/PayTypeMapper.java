package kr.co.etoursoft.tstleaf.mapper.pay;

import java.util.List;
import java.util.Map;

public interface PayTypeMapper {

    public Map<String, Object> selectPayType(Map<String, Object> map) throws Exception;

    public List<Map<String, Object>> selectPayTypeList(Map<String, Object> map) throws Exception;

}
