/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.workflow.kaleo.service.base;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.workflow.kaleo.service.KaleoTaskAssignmentInstanceLocalServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
@ProviderType
public class KaleoTaskAssignmentInstanceLocalServiceClpInvoker {
	public KaleoTaskAssignmentInstanceLocalServiceClpInvoker() {
		_methodName0 = "addKaleoTaskAssignmentInstance";

		_methodParameterTypes0 = new String[] {
				"com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignmentInstance"
			};

		_methodName1 = "createKaleoTaskAssignmentInstance";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteKaleoTaskAssignmentInstance";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteKaleoTaskAssignmentInstance";

		_methodParameterTypes3 = new String[] {
				"com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignmentInstance"
			};

		_methodName4 = "dynamicQuery";

		_methodParameterTypes4 = new String[] {  };

		_methodName5 = "dynamicQuery";

		_methodParameterTypes5 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName6 = "dynamicQuery";

		_methodParameterTypes6 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "dynamicQueryCount";

		_methodParameterTypes9 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery",
				"com.liferay.portal.kernel.dao.orm.Projection"
			};

		_methodName10 = "fetchKaleoTaskAssignmentInstance";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getKaleoTaskAssignmentInstance";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getActionableDynamicQuery";

		_methodParameterTypes12 = new String[] {  };

		_methodName14 = "deletePersistedModel";

		_methodParameterTypes14 = new String[] {
				"com.liferay.portal.model.PersistedModel"
			};

		_methodName15 = "getPersistedModel";

		_methodParameterTypes15 = new String[] { "java.io.Serializable" };

		_methodName16 = "getKaleoTaskAssignmentInstances";

		_methodParameterTypes16 = new String[] { "int", "int" };

		_methodName17 = "getKaleoTaskAssignmentInstancesCount";

		_methodParameterTypes17 = new String[] {  };

		_methodName18 = "updateKaleoTaskAssignmentInstance";

		_methodParameterTypes18 = new String[] {
				"com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignmentInstance"
			};

		_methodName105 = "getBeanIdentifier";

		_methodParameterTypes105 = new String[] {  };

		_methodName106 = "setBeanIdentifier";

		_methodParameterTypes106 = new String[] { "java.lang.String" };

		_methodName111 = "addKaleoTaskAssignmentInstance";

		_methodParameterTypes111 = new String[] {
				"long",
				"com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken",
				"java.lang.String", "long",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName112 = "addTaskAssignmentInstances";

		_methodParameterTypes112 = new String[] {
				"com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken",
				"java.util.Collection", "java.util.Map",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName113 = "assignKaleoTaskAssignmentInstance";

		_methodParameterTypes113 = new String[] {
				"com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken",
				"java.lang.String", "long",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName114 = "completeKaleoTaskInstanceToken";

		_methodParameterTypes114 = new String[] {
				"long", "com.liferay.portal.service.ServiceContext"
			};

		_methodName115 = "deleteCompanyKaleoTaskAssignmentInstances";

		_methodParameterTypes115 = new String[] { "long" };

		_methodName116 = "deleteKaleoDefinitionKaleoTaskAssignmentInstances";

		_methodParameterTypes116 = new String[] { "long" };

		_methodName117 = "deleteKaleoInstanceKaleoTaskAssignmentInstances";

		_methodParameterTypes117 = new String[] { "long" };

		_methodName118 = "deleteKaleoTaskAssignmentInstances";

		_methodParameterTypes118 = new String[] {
				"com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken"
			};

		_methodName119 = "getKaleoTaskAssignmentInstances";

		_methodParameterTypes119 = new String[] { "long" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return KaleoTaskAssignmentInstanceLocalServiceUtil.addKaleoTaskAssignmentInstance((com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignmentInstance)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return KaleoTaskAssignmentInstanceLocalServiceUtil.createKaleoTaskAssignmentInstance(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return KaleoTaskAssignmentInstanceLocalServiceUtil.deleteKaleoTaskAssignmentInstance(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return KaleoTaskAssignmentInstanceLocalServiceUtil.deleteKaleoTaskAssignmentInstance((com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignmentInstance)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return KaleoTaskAssignmentInstanceLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return KaleoTaskAssignmentInstanceLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return KaleoTaskAssignmentInstanceLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return KaleoTaskAssignmentInstanceLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator<?>)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return KaleoTaskAssignmentInstanceLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return KaleoTaskAssignmentInstanceLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return KaleoTaskAssignmentInstanceLocalServiceUtil.fetchKaleoTaskAssignmentInstance(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return KaleoTaskAssignmentInstanceLocalServiceUtil.getKaleoTaskAssignmentInstance(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return KaleoTaskAssignmentInstanceLocalServiceUtil.getActionableDynamicQuery();
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return KaleoTaskAssignmentInstanceLocalServiceUtil.deletePersistedModel((com.liferay.portal.model.PersistedModel)arguments[0]);
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return KaleoTaskAssignmentInstanceLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName16.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes16, parameterTypes)) {
			return KaleoTaskAssignmentInstanceLocalServiceUtil.getKaleoTaskAssignmentInstances(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName17.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes17, parameterTypes)) {
			return KaleoTaskAssignmentInstanceLocalServiceUtil.getKaleoTaskAssignmentInstancesCount();
		}

		if (_methodName18.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes18, parameterTypes)) {
			return KaleoTaskAssignmentInstanceLocalServiceUtil.updateKaleoTaskAssignmentInstance((com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignmentInstance)arguments[0]);
		}

		if (_methodName105.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes105, parameterTypes)) {
			return KaleoTaskAssignmentInstanceLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName106.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes106, parameterTypes)) {
			KaleoTaskAssignmentInstanceLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName111.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes111, parameterTypes)) {
			return KaleoTaskAssignmentInstanceLocalServiceUtil.addKaleoTaskAssignmentInstance(((Long)arguments[0]).longValue(),
				(com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken)arguments[1],
				(java.lang.String)arguments[2],
				((Long)arguments[3]).longValue(),
				(com.liferay.portal.service.ServiceContext)arguments[4]);
		}

		if (_methodName112.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes112, parameterTypes)) {
			return KaleoTaskAssignmentInstanceLocalServiceUtil.addTaskAssignmentInstances((com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken)arguments[0],
				(java.util.Collection<com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignment>)arguments[1],
				(java.util.Map<java.lang.String, java.io.Serializable>)arguments[2],
				(com.liferay.portal.service.ServiceContext)arguments[3]);
		}

		if (_methodName113.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes113, parameterTypes)) {
			return KaleoTaskAssignmentInstanceLocalServiceUtil.assignKaleoTaskAssignmentInstance((com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken)arguments[0],
				(java.lang.String)arguments[1],
				((Long)arguments[2]).longValue(),
				(com.liferay.portal.service.ServiceContext)arguments[3]);
		}

		if (_methodName114.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes114, parameterTypes)) {
			return KaleoTaskAssignmentInstanceLocalServiceUtil.completeKaleoTaskInstanceToken(((Long)arguments[0]).longValue(),
				(com.liferay.portal.service.ServiceContext)arguments[1]);
		}

		if (_methodName115.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes115, parameterTypes)) {
			KaleoTaskAssignmentInstanceLocalServiceUtil.deleteCompanyKaleoTaskAssignmentInstances(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName116.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes116, parameterTypes)) {
			KaleoTaskAssignmentInstanceLocalServiceUtil.deleteKaleoDefinitionKaleoTaskAssignmentInstances(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName117.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes117, parameterTypes)) {
			KaleoTaskAssignmentInstanceLocalServiceUtil.deleteKaleoInstanceKaleoTaskAssignmentInstances(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName118.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes118, parameterTypes)) {
			KaleoTaskAssignmentInstanceLocalServiceUtil.deleteKaleoTaskAssignmentInstances((com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken)arguments[0]);

			return null;
		}

		if (_methodName119.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes119, parameterTypes)) {
			return KaleoTaskAssignmentInstanceLocalServiceUtil.getKaleoTaskAssignmentInstances(((Long)arguments[0]).longValue());
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName16;
	private String[] _methodParameterTypes16;
	private String _methodName17;
	private String[] _methodParameterTypes17;
	private String _methodName18;
	private String[] _methodParameterTypes18;
	private String _methodName105;
	private String[] _methodParameterTypes105;
	private String _methodName106;
	private String[] _methodParameterTypes106;
	private String _methodName111;
	private String[] _methodParameterTypes111;
	private String _methodName112;
	private String[] _methodParameterTypes112;
	private String _methodName113;
	private String[] _methodParameterTypes113;
	private String _methodName114;
	private String[] _methodParameterTypes114;
	private String _methodName115;
	private String[] _methodParameterTypes115;
	private String _methodName116;
	private String[] _methodParameterTypes116;
	private String _methodName117;
	private String[] _methodParameterTypes117;
	private String _methodName118;
	private String[] _methodParameterTypes118;
	private String _methodName119;
	private String[] _methodParameterTypes119;
}