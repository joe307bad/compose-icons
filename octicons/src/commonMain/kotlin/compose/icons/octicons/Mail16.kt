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

public val Octicons.Mail16: ImageVector
    get() {
        if (_mail16 != null) {
            return _mail16!!
        }
        _mail16 = Builder(name = "Mail16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.75f, 2.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 0.0f, 3.75f)
                verticalLineToRelative(0.736f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 0.027f)
                verticalLineToRelative(7.737f)
                curveTo(0.0f, 13.216f, 0.784f, 14.0f, 1.75f, 14.0f)
                horizontalLineToRelative(12.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 16.0f, 12.25f)
                verticalLineToRelative(-8.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 14.25f, 2.0f)
                lineTo(1.75f, 2.0f)
                close()
                moveTo(14.5f, 4.07f)
                verticalLineToRelative(-0.32f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                lineTo(1.75f, 3.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(0.32f)
                lineTo(8.0f, 7.88f)
                lineToRelative(6.5f, -3.81f)
                close()
                moveTo(1.5f, 5.81f)
                verticalLineToRelative(6.441f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(12.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                lineTo(14.5f, 5.809f)
                lineTo(8.38f, 9.397f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.76f, 0.0f)
                lineTo(1.5f, 5.809f)
                close()
            }
        }
        .build()
        return _mail16!!
    }

private var _mail16: ImageVector? = null
