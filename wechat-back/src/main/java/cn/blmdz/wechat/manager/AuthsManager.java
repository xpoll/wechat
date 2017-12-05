//package cn.blmdz.wechat.manager;
//
//import java.util.Map;
//import java.util.concurrent.TimeUnit;
//
//import org.springframework.stereotype.Component;
//
//import com.google.common.base.Optional;
//import com.google.common.cache.CacheBuilder;
//import com.google.common.cache.CacheLoader;
//import com.google.common.cache.LoadingCache;
//import com.google.common.collect.Maps;
//
//import cn.blmdz.wechat.auth.AuthUtils;
//import cn.blmdz.wechat.auth.Node;
//import cn.blmdz.wechat.enums.UserRole;
//
///**
// * @author yangyz
// */
//@Component
//public class AuthsManager {
//
//	private final LoadingCache<String, Optional<Map<String, Node>>> authsRolesTreeMapCache;
//	private final LoadingCache<String, Optional<Map<String, Node>>> authsTreeCache;
//	
//	
//	public AuthsManager() {
//		authsRolesTreeMapCache = CacheBuilder.newBuilder()
//				.expireAfterWrite(2, TimeUnit.HOURS)
//				.build(new CacheLoader<String, Optional<Map<String, Node>>>(){
//					@Override
//					public Optional<Map<String, Node>> load(String key) throws Exception {
//						return Optional.fromNullable(AuthUtils.readAuthsRolesTreeMap(UserRole.ADMIN.toString().toLowerCase()));
//					}
//		});
//		authsTreeCache = CacheBuilder.newBuilder()
//				.expireAfterWrite(2, TimeUnit.HOURS)
//				.build(new CacheLoader<String, Optional<Map<String, Node>>>(){
//					@Override
//					public Optional<Map<String, Node>> load(String key) throws Exception {
//						return Optional.fromNullable(AuthUtils.readAuthsTree(UserRole.ADMIN.toString().toLowerCase()));
//					}
//		});
//	}
//
//
//	/**
//	 * 根据系统角色名称获取权限资源
//	 */
//	public Map<String, Node> readAuthsRolesTreeMap() {
//		Optional<Map<String, Node>> optional = authsRolesTreeMapCache.getUnchecked("");
//		if (optional.isPresent())
//			return optional.get();
//		return Maps.newLinkedHashMap();
//	}
//
//	/**
//	 * 根据系统角色名称获取全部权限树菜单
//	 */
//	public Map<String, Node> readAuthsTree() {
//		Optional<Map<String, Node>> optional = authsTreeCache.getUnchecked("");
//		if (optional.isPresent())
//			return optional.get();
//		return Maps.newLinkedHashMap();
//	}
//}