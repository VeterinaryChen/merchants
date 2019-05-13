package com.imooc.passbook.passbook.Mapper;

import com.imooc.passbook.passbook.Constant.Constants;
import com.imooc.passbook.passbook.Vo.Feedback;
import com.spring4all.spring.boot.starter.hbase.api.RowMapper;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.util.Bytes;

/**
 * @Auther: JeffChen
 * @Date: 2019/5/13 14:37
 * <h1> Feedback Hbase Row To FeedBack Object </h1>
 */
public class FeedbackRowMapper implements RowMapper<Feedback> {

    private static byte[] FAMILY_I = Constants.Feedback.FAMILY_I.getBytes();
    private static byte[] USER_ID = Constants.Feedback.USER_ID.getBytes();
    private static byte[] TYPE = Constants.Feedback.TYPE.getBytes();
    private static byte[] TEMPLATE_ID = Constants.Feedback.TEMPLATE_ID.getBytes();
    private static byte[] COMMENT = Constants.Feedback.COMMENT.getBytes();

    @Override
    public Feedback mapRow (Result result, int rowNum) throws Exception {

        Feedback feedback = new Feedback();
        feedback.setId(Bytes.toLong(result.getValue(FAMILY_I,USER_ID)));
        feedback.setType(Bytes.toString(result.getValue(FAMILY_I,TYPE)));
        feedback.setTemplateId(Bytes.toString(result.getValue(FAMILY_I,TEMPLATE_ID)));
        feedback.setComment(Bytes.toString(result.getValue(FAMILY_I,COMMENT)));

        return feedback;
    }
}
