package com.hbnu.common.vo.rank.dto;

import com.hbnu.common.enums.rank.ActivityRankTimeEnum;
import lombok.Data;

import java.util.List;

/**
 * 排行榜信息
 *
 * @author YiHui
 * @date 2023/8/19
 */
@Data
public class RankInfoDTO {
    private ActivityRankTimeEnum time;
    private List<RankItemDTO> items;
}
