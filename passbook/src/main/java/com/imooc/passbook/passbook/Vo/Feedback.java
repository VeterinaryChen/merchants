package com.imooc.passbook.passbook.Vo;

import com.google.protobuf.Enum;
import com.imooc.passbook.passbook.Constant.FeedbackType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.google.common.base.Enums;

/**
 * @Auther: JeffChen
 * @Date: 2019/5/12 16:38
 * <h1> 用户评论表 </h1>
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Feedback {
    
    /**
     * 功能描述: 用户 id
     * @auther: JeffChen
     * @date: 2019/5/12 16:39
     */
    private Long id;

    /**
     * 功能描述: 评论类型
     * @auther: JeffChen
     * @date: 2019/5/12 16:39
     */
    private String type;

    /**
     * 功能描述: PassTemplate RowKey，如果是 app 类型的评论，则没有
     * @auther: JeffChen
     * @date: 2019/5/12 16:39
     */
    private String templateId;

    /**
     * 功能描述: 评论内容
     * @auther: JeffChen
     * @date: 2019/5/12 16:40
     */
    private String comment;

    private boolean validate(){

        FeedbackType feedbackType = Enums.getIfPresent(
                FeedbackType.class,this.type.toUpperCase()
        ).orNull();

        return !(null == feedbackType || null == comment);
    }

}
