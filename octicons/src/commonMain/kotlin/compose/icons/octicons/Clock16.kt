package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Clock16: ImageVector
    get() {
        if (_clock16 != null) {
            return _clock16!!
        }
        _clock16 = Builder(name = "Clock16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.5f, 8.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, true, 13.0f, 0.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, -13.0f, 0.0f)
                close()
                moveTo(8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 8.0f, 0.0f)
                close()
                moveTo(8.5f, 4.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.471f, 0.696f)
                lineToRelative(2.5f, 1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.557f, -1.392f)
                lineTo(8.5f, 7.742f)
                lineTo(8.5f, 4.75f)
                close()
            }
        }
        .build()
        return _clock16!!
    }

private var _clock16: ImageVector? = null
