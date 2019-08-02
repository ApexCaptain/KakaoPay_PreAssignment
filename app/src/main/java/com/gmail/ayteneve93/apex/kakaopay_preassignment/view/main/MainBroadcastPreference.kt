package com.gmail.ayteneve93.apex.kakaopay_preassignment.view.main

import com.gmail.ayteneve93.apex.kakaopay_preassignment.utils.ConstantUtils

@Suppress(ConstantUtils.SuppressWarningAttributes.SPELL_CHECKING_INSPECTION)
object MainBroadcastPreference {

    object Action {
        const val NEW_SEARCH_QUERY_INPUT = "com.gmail.ayteneve93.apex.kakaopay_preassignment.view.main.Action.NEW_SEARCH_QUERY_INPUT"
        const val SORT_OPTION_CHANGED = "com.gmail.ayteneve93.apex.kakaopay_preassignment.view.main.Action.SORT_OPTION_CHANGED"
        const val PINCH = "com.gmail.ayteneve93.apex.kakaopay_preassignment.view.main.Action.PINCH"
    }

    object Target {
        const val KEY = "com.gmail.ayteneve93.apex.kakaopay_preassignment.view.main.Target.KEY"
        object PredefinedValues {
            const val IMAGE_LIST = "com.gmail.ayteneve93.apex.kakaopay_preassignment.view.main.Target.PredefinedValues.IMAGE_LIST"
        }
    }

    object Extra {
        object QueryString {
            const val KEY = "com.gmail.ayteneve93.apex.kakaopay_preassignment.view.main.Extra.QueryString.KEY"
        }
        object SortOption {
            const val KEY = "com.gmail.ayteneve93.apex.kakaopay_preassignment.view.main.Extra.SortOption.KEY"
        }
        object PinchState {
            const val KEY = "com.gmail.ayteneve93.apex.kakaopay_preassignment.view.main.Extra.PinchState.KEY"
            object PredefinedValues {
                const val ZOOM_IN = true
                const val ZOOM_OUT = false
            }
        }
    }

}