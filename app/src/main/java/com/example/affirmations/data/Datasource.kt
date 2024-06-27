
package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

/**
 * [Datasource] generates a list of [Affirmation]
 */
class Datasource() {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.beaches1, R.drawable.beach1),
            Affirmation(R.string.beaches2, R.drawable.beach2),
            Affirmation(R.string.beaches3, R.drawable.beach3),
            Affirmation(R.string.beaches4, R.drawable.beach4),
            Affirmation(R.string.beaches5, R.drawable.beach5),
            Affirmation(R.string.beaches6, R.drawable.beach6),
            Affirmation(R.string.beaches7, R.drawable.beach7),
            Affirmation(R.string.beaches8, R.drawable.beach8),
            Affirmation(R.string.beaches9, R.drawable.beach9),
            Affirmation(R.string.beaches10, R.drawable.beach10))
    }
}
