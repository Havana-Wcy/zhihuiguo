package com.wcy.zhihuiguo.scoring;

import com.wcy.zhihuiguo.model.entity.App;
import com.wcy.zhihuiguo.model.entity.UserAnswer;

import java.util.List;

/**
 * 评分策略
 *
 * 
 * @from <a href="https://www.code-nav.cn">编程导航学习圈</a>
 */
public interface ScoringStrategy {

    /**
     * 执行评分
     *
     * @param choices
     * @param app
     * @return
     * @throws Exception
     */
    UserAnswer doScore(List<String> choices, App app) throws Exception;
}