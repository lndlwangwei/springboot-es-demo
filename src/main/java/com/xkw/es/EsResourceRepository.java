package com.xkw.es;

import com.xkw.domain.Resource;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author wangwei
 * @since 1.0
 */
public interface EsResourceRepository extends ElasticsearchRepository<Resource, Integer> {
}
